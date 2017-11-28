package universidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuUniversidad {

    private Universidad _universidad;
    private BufferedReader _entrada = new BufferedReader(new InputStreamReader(System.in));

    public MenuUniversidad(Universidad universidad) {
        _universidad = universidad;       
    }

    public void mostrarMenuPrincipal() {
        System.out.println();
        System.out.println("Universidad " + _universidad.obtenerNombre());
        System.out.println("1 - Gestion de PAS");
        System.out.println("2 - Gestion de PDI");
        System.out.println("3 - Generar nominas");
        System.out.println("4 - Mostrar personal");
        System.out.println("5 - Salir");
        System.out.println();
        System.out.println("Seleccione una opcion...");
    }

    public void mostrarMenuPAS() {
        System.out.println();
        System.out.println("Gestion de PAS");
        System.out.println("1 - Contratar PAS");
        System.out.println("2 - Jubilar PAS");
        System.out.println("3 - Modificar PAS");
        System.out.println("4 - Salir");
        System.out.println();
        System.out.println("Seleccione una opcion...");
    }

    public void mostrarMenuPDI() {
        System.out.println();
        System.out.println("Gestion de PDI");
        System.out.println("1 - Contratar PDI");
        System.out.println("2 - Jubilar PDI");
        System.out.println("3 - Modificar PDI");
        System.out.println("4 - Salir");
        System.out.println();
        System.out.println("Seleccione una opcion...");
    }

    public int leerOpcion(int maximo) throws IOException {
        String linea;
        int opcion;
        boolean correcta;

        opcion = 0;
        correcta = false;
        while (!correcta) {
            linea = _entrada.readLine();
            try {
                opcion = Integer.parseInt(linea.trim());
                if ((opcion >= 1) && (opcion <= maximo)) {
                    correcta = true;
                } else {
                    System.out.println();
                    System.out.println("ERROR: Opcion fuera de rango (1-"
                            + maximo + ")");
                    System.out.println();
                    mostrarMenuPrincipal();
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un numero");
            }
        }
        return opcion;
    }

    public Handler leerIdentificador() throws IOException {
        boolean correcto;
        Handler id;
        char car;

        correcto = false;
        id = null;
        while (!correcto) {
            System.out.println("Seleccione: 1 - Identificador, 2 -NIF: ");
            car = _entrada.readLine().charAt(0);
            if (car == '1') {
                try {
                    System.out.println("Introduzca el identificador: ");
                    id = new Identificador(_entrada.readLine().trim());
                    correcto = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: el identificador "
                            + "introducido debe ser un numero.");
                }

            } else if (car == '2') {
                try {
                    System.out.println("Introduzca el NIF: ");
                    String nif = _entrada.readLine();
                    id = new NIF(nif.trim());
                    correcto = true;
                } catch (BadFormatException b) {
                    System.out.println("Error: el NIF "
                            + "introducido debe ser correcto.");
                }
            } else {
                correcto = false;
            }
        }
        return id;
    }

    public boolean menuPrincipal() throws IOException {
        boolean salir;
        int opcion;

        salir = false;
        mostrarMenuPrincipal();
        opcion = leerOpcion(5);

        switch (opcion) {
            case 1: // menu PAS
                while (!salir) {
                    salir = menuPAS();
                }
                salir = false;
                break;
            case 2: // menu PDI
                while (!salir) {
                    salir = menuPDI();
                }
                salir = false;
                break;
            case 3: // generar nominas
                _universidad.generarNominas();
                break;
            case 4: // mostrar universidad
                System.out.println("----------------------------------------");
                System.out.println("Universidad "
                        + _universidad.obtenerNombre());
                System.out.println("----------------------------------------");
                System.out.println(_universidad.toString());
                System.out.println("----------------------------------------");
                break;
            case 5: // salir de la aplicacion
                salir = true;
        }

        return salir;
    }

    public boolean menuPAS() throws IOException {
        int opcion;
        boolean salir;
        Handler identificador;
        Personal persona;
        String linea, seccion, cargo;

        salir = false;
        seccion = null;
        cargo = null;
        mostrarMenuPAS();
        opcion = leerOpcion(4);

        switch (opcion) {
            case 1:  // contratar
                identificador = leerIdentificador();

                System.out.println("Seccion: ");
                seccion = _entrada.readLine();

                System.out.println("Cargo: ");
                cargo = _entrada.readLine();

                try {
                    if (_universidad.contratar((Personal) new PAS(identificador, seccion, cargo))) {
                        System.out.println("Personal con identificador "
                                + identificador
                                + " dado de alta en el sistema.");
                    } else {
                        System.out.println("Error: personal con identificador "
                                + identificador
                                + " no ha sido dado de alta en el sistema");
                    }
                } catch (BadFormatException e) {
                    System.out.println("Error: formato de identificador no valido");
                }
                break;
            case 2: // jubilar
                identificador = leerIdentificador();

                if (_universidad.jubilar(identificador)) {
                    System.out.println("Personal con identificador "
                            + identificador
                            + " dado de baja en el sistema.");
                } else {
                    System.out.println("Error: personal con identificador "
                            + identificador + " no existe");
                }
                break;
            case 3: // modificar
                identificador = leerIdentificador();

                persona = _universidad.buscar(identificador);
                if (persona == null) {
                    System.out.println("Error: personal con identificador "
                            + identificador + " no existe");
                } else {
                    System.out.println(persona.toString());
                    System.out.println("Nueva seccion: ");
                    linea = _entrada.readLine();
                    if (linea.length() != 0) {
                        seccion = linea;
                    }
                    System.out.println("Nuevo cargo: ");
                    linea = _entrada.readLine();
                    if (linea.length() != 0) {
                        cargo = linea;
                    }
                    try {
                        if (_universidad.modificar(new PAS(identificador, seccion, cargo))) {
                            System.out.println("Personal con identificador "
                                    + identificador
                                    + " modificado.");
                        } else {
                            System.out.println("Error: personal con identificador "
                                    + identificador + " no fue modificado");
                        }
                    } catch (BadFormatException e) {
                        System.out.println("Error: formato de identificador no valido");
                    }
                }
                break;

            case 4: // salir del submenu
                salir = true;
        }

        return salir;
    }

    public boolean menuPDI() throws IOException {
        int opcion;
        boolean salir;
        Handler identificador;
        Personal persona;
        String linea, departamento, area;

        salir = false;
        departamento = null;
        area = null;
        mostrarMenuPDI();
        opcion = leerOpcion(4);

        switch (opcion) {
            case 1:  // contratar
                identificador = leerIdentificador();

                System.out.println("Departamento: ");
                departamento = _entrada.readLine();

                System.out.println("Area: ");
                area = _entrada.readLine();

                try {
                    if (_universidad.contratar((Personal) new PDI(identificador, departamento, area))) {
                        System.out.println("Personal con identificador "
                                + identificador
                                + " dado de alta en el sistema.");
                    } else {
                        System.out.println("Error: personal con identificador "
                                + identificador
                                + " no ha sido dado de alta en el sistema");
                    }
                } catch (BadFormatException e) {
                    System.out.println("Error: formato de identificador no valido");
                }

                break;
            case 2: // jubilar
                identificador = leerIdentificador();

                if (_universidad.jubilar(identificador)) {
                    System.out.println("Personal con identificador "
                            + identificador
                            + " dado de baja en el sistema.");
                } else {
                    System.out.println("Error: personal con identificador "
                            + identificador + " no existe");
                }
                break;
            case 3: // modificar
                identificador = leerIdentificador();

                persona = _universidad.buscar(identificador);
                if (persona == null) {
                    System.out.println("Error: personal con identificador "
                            + identificador + " no existe");
                } else {
                    System.out.println(persona.toString());
                    System.out.println("Nuevo departamento: ");
                    linea = _entrada.readLine();
                    if (linea.length() != 0) {
                        departamento = linea;
                    }
                    System.out.println("Nueva area: ");
                    linea = _entrada.readLine();
                    if (linea.length() != 0) {
                        area = linea;
                    }
                    try {
                        if (_universidad.modificar(new PDI(identificador, departamento, area))) {
                            System.out.println("Personal con identificador "
                                    + identificador
                                    + " modificado.");
                        } else {
                            System.out.println("Error: personal con identificador "
                                    + identificador + " no fue modificado");
                        }
                    } catch (BadFormatException e) {
                        System.out.println("Error: formato de identificador no valido");
                    }

                }

                break;
            case 4: // salir del submenu
                salir = true;
        }

        return salir;
    }
}
