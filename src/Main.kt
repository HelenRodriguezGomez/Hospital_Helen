import java.util.Scanner

val medicos = mutableListOf<Medico>()
val pacientes = mutableListOf<Paciente>()
val citasMedicas = mutableListOf<CitaMedica>()


fun main() {
    val scanner = Scanner(System.`in`)
    var opcion: Int

    do {
        println("--------------------------------------")
        println("\n----------- Menú Principal ------------")
        println("1. Registrar Paciente")
        println("2. Registrar Médico")
        println("3. Registrar Cita Médica")
        println("4. Listar Médicos por Especialidad")
        println("5. Listar Pacientes por Médico")
        println("6. Salir")
        println("Seleccione una opción: ")
        println("--------------------------------------")
        println("--------------------------------------")

        opcion = scanner.nextInt()

        when (opcion) {
            1 -> registrarPaciente(scanner)
            2 -> registrarMedico(scanner)
            3 -> registrarCitaMedica(scanner)
            4 -> listarMedicosPorEspecialidad(scanner)
            5 -> listarPacientesPorMedico(scanner)
            6 -> println("Saliendo de la aplicación...")
            else -> println("Opción no válida, por favor intente nuevamente.")
        }
    } while (opcion != 6)
}

fun registrarPaciente(scanner: Scanner) {
    println("\n--- Registro de Paciente ---")
    println("Ingrese el DNI:")
    val dni = scanner.next()
    println("Ingrese el nombre:")
    val nombre = scanner.next()
    println("Ingrese el apellido:")
    val apellido = scanner.next()
    println("Ingrese la fecha de nacimiento:")
    val fechaNacimiento = scanner.next()
    println("Ingrese la dirección:")
    val direccion = scanner.next()
    println("Ingrese la ciudad de procedencia:")
    val ciudadProcedencia = scanner.next()
    println("Ingrese el número de historia clínica:")
    val numeroHistoriaClinica = scanner.next()
    println("Ingrese el sexo:")
    val sexo = scanner.next()
    println("Ingrese el grupo sanguíneo:")
    val grupoSanguineo = scanner.next()
    println("Ingrese los medicamentos a los que es alérgico (separados por coma):")
    val medicamentosAlergicos = scanner.next().split(",")

    val paciente = Paciente(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, numeroHistoriaClinica, sexo, grupoSanguineo, medicamentosAlergicos)
    pacientes.add(paciente)
    println("Paciente registrado exitosamente.")
}

fun registrarMedico(scanner: Scanner) {
    println("\n--- Registro de Médico ---")
    println("Ingrese el DNI:")
    val dni = scanner.next()
    println("Ingrese el nombre:")
    val nombre = scanner.next()
    println("Ingrese el apellido:")
    val apellido = scanner.next()
    println("Ingrese la fecha de nacimiento:")
    val fechaNacimiento = scanner.next()
    println("Ingrese la dirección:")
    val direccion = scanner.next()
    println("Ingrese la ciudad de procedencia:")
    val ciudadProcedencia = scanner.next()
    println("Ingrese el código de empleado:")
    val codigoEmpleado = scanner.next()
    println("Ingrese el número de horas extras:")
    val horasExtras = scanner.nextInt()
    println("Ingrese la fecha de ingreso:")
    val fechaIngreso = scanner.next()
    println("Ingrese el área:")
    val area = scanner.next()
    println("Ingrese el cargo:")
    val cargo = scanner.next()
    println("Ingrese el salario mensual:")
    val salarioMensual = scanner.nextDouble()
    println("Ingrese el porcentaje adicional por hora extra:")
    val porcentajeAdicionalHoraExtra = scanner.nextDouble()
    println("Ingrese la especialidad:")
    val especialidad = scanner.next()
    println("Ingrese el servicio:")
    val servicio = scanner.next()
    println("Ingrese el número de consultorio:")
    val numeroConsultorio = scanner.nextInt()

    val medico = Medico(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual, porcentajeAdicionalHoraExtra, especialidad, servicio, numeroConsultorio)
    medicos.add(medico)
    println("Médico registrado exitosamente.")
}
fun registrarCitaMedica(scanner: Scanner) {
    println("\n--- Registro de Cita Médica ---")

    // Pedimos la información necesaria para registrar la cita
    println("Ingrese el DNI del paciente:")
    val dniPaciente = scanner.next()
    val paciente = pacientes.find { it.dni == dniPaciente }

    if (paciente == null) {
        println("Paciente no encontrado.")
        return
    }

    println("Ingrese la especialidad del médico:")
    val especialidad = scanner.next()
    val medico = medicos.find { it.especialidad.equals(especialidad, ignoreCase = true) }

    if (medico == null) {
        println("No se encontró un médico con esa especialidad.")
        return
    }

    println("Ingrese la fecha de la cita (dd-mm-aaaa):")
    val fechaCita = scanner.next()

    println("Ingrese la hora de la cita (hh:mm):")
    val horaCita = scanner.next()

    // Aquí puedes guardar la cita en una lista de citas o simplemente imprimir los datos
    println("Cita registrada exitosamente:")
    println("Paciente: ${paciente.nombre} ${paciente.apellido}")
    println("Médico: ${medico.nombre} ${medico.apellido}, Especialidad: ${medico.especialidad}")
    println("Fecha: $fechaCita, Hora: $horaCita")
}


fun listarMedicosPorEspecialidad(scanner: Scanner) {
    println("\n--- Listar Médicos por Especialidad ---")
    println("Ingrese la especialidad a buscar:")
    val especialidad = scanner.next()
    val medicosEspecialidad = medicos.filter { it.especialidad.equals(especialidad, ignoreCase = true) }
    if (medicosEspecialidad.isNotEmpty()) {
        medicosEspecialidad.forEach { medico ->
            println("Nombre: ${medico.nombre} ${medico.apellido}, Consultorio: ${medico.numeroConsultorio}")
        }
    } else {
        println("No se encontraron médicos con la especialidad: $especialidad")
    }
}

fun listarPacientesPorMedico(scanner: Scanner) {
    println("\n--- Listar Pacientes por Médico ---")
    println("Ingrese el código del médico:")
    val codigoEmpleado = scanner.next()

    // Encontrar citas para el médico especificado
    val citas = citasMedicas.filter { it.medicoCodigo == codigoEmpleado }

    if (citas.isEmpty()) {
        println("EN MANTENIMIENTO: $codigoEmpleado")
        return
    }


    println("Pacientes atendidos por el médico con código $codigoEmpleado:")
    citas.forEach { cita ->
        val paciente = pacientes.find { it.dni == cita.pacienteDni }
        if (paciente != null) {
            println("Nombre: ${paciente.nombre} ${paciente.apellido}")
        } else {
            println("Paciente con DNI ${cita.pacienteDni} no encontrado.")
        }
    }
}

