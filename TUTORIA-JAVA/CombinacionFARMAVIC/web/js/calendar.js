PrimeFaces.locales['es'] = {
    closeText: 'Cerrar',
    prevText: 'Anterior',
    nextText: 'Siguiente',
    monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
    monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
    dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
    dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'],
    dayNamesMin: ['D', 'L', 'M', 'X', 'J', 'V', 'S'],
    weekHeader: 'Semana',
    firstDay: 1,
    isRTL: false,
    showMonthAfterYear: false,
    yearSuffix: '',
    timeOnlyTitle: 'Sólo hora',
    timeText: 'Tiempo',
    hourText: 'Hora',
    minuteText: 'Minuto',
    secondText: 'Segundo',
    currentText: 'Fecha actual',
    ampm: false,
    month: 'Mes',
    week: 'Semana',
    day: 'Día',
    allDayText: 'Todo el día',
    messages: {//optional for Client Side Validation
        'javax.faces.component.UIInput.REQUIRED': '{0}: Error de validación: se necesita un valor.',
        'javax.faces.converter.IntegerConverter.INTEGER': '{2}: \'{0}\' debe ser un número formado por uno o varios dígitos.',
        'javax.faces.converter.IntegerConverter.INTEGER_detail': '{2}: \'{0}\' debe ser un número entre -2147483648 y 2147483647. Ejemplo: {1}',
        'javax.faces.converter.DoubleConverter.DOUBLE': '{2}: \'{0}\' debe ser un número formado por uno o varios dígitos.',
        'javax.faces.converter.DoubleConverter.DOUBLE_detail': '{2}: \'{0}\' debe ser un número entre 4.9E-324 y 1.7976931348623157E308  Ejemplo: {1}',
        'javax.faces.converter.BigDecimalConverter.DECIMAL': '{2}: \'{0}\' debe ser un número decimal positivo o negativo.',
        'javax.faces.converter.BigDecimalConverter.DECIMAL_detail': '{2}: \'{0}\' debe ser un número decimal positivo o negativo formado por cero o más dígitos, que pueden incluir a continuación una coma decimal y una fracción.  Ejemplo: {1}',
        'javax.faces.converter.BigIntegerConverter.BIGINTEGER': '{2}: \'{0}\' debe ser un número formado por uno o varios dígitos.',
        'javax.faces.converter.BigIntegerConverter.BIGINTEGER_detail': '{2}: \'{0}\' debe ser un número formado por uno o varios dígitos. Ejemplo: {1}',
        'javax.faces.converter.ByteConverter.BYTE': '{2}: \'{0}\' debe ser un número entre 0 y 255.',
        'javax.faces.converter.ByteConverter.BYTE_detail': '{2}: \'{0}\' debe ser un número entre 0 y 255.  Ejemplo: {1}',
        'javax.faces.converter.CharacterConverter.CHARACTER': '{1}: \'{0}\' debe ser un carácter válido.',
        'javax.faces.converter.CharacterConverter.CHARACTER_detail': '{1}: \'{0}\' debe ser un carácter ASCII válido.',
        'javax.faces.converter.ShortConverter.SHORT': '{2}: \'{0}\' debe ser un número formado por uno o varios dígitos.',
        'javax.faces.converter.ShortConverter.SHORT_detail': '{2}: \'{0}\' debe ser un número entre -32768 y 32767 Ejemplo: {1}',
        'javax.faces.converter.BooleanConverter.BOOLEAN': '{1}: \'{0}\' debe ser \'true\' o \'false\'',
        'javax.faces.converter.BooleanConverter.BOOLEAN_detail': '{1}: \'{0}\' debe ser \'true\' o \'false\'.  Cualquier valor diferente a \'true\' se evaluará como \'false\'.',
        'javax.faces.validator.LongRangeValidator.MAXIMUM': '{1}: Error de validación: el valor es mayor que el máximo permitido de \'{0}\'',
        'javax.faces.validator.LongRangeValidator.MINIMUM': '{1}: Error de validación: el valor es inferior que el mínimo permitido de \'{0}\'',
        'javax.faces.validator.LongRangeValidator.NOT_IN_RANGE': '{2}: Error de validación: el atributo especificado no está entre los valores esperados {0} y {1}.',
        'javax.faces.validator.LongRangeValidator.TYPE={0}': 'Error de validación: el valor no tiene el tipo correcto.',
        'javax.faces.validator.DoubleRangeValidator.MAXIMUM': '{1}: Error de validación: el valor es mayor que el máximo permitido de \'{0}\'',
        'javax.faces.validator.DoubleRangeValidator.MINIMUM': '{1}: Error de validación: el valor es inferior que el mínimo permitido de \'{0}\'',
        'javax.faces.validator.DoubleRangeValidator.NOT_IN_RANGE': '{2}: Error de validación: el atributo especificado no está entre los valores esperados {0} y {1}',
        'javax.faces.validator.DoubleRangeValidator.TYPE={0}': 'Error de validación: el valor no tiene el tipo correcto.',
        'javax.faces.converter.FloatConverter.FLOAT': '{2}: \'{0}\' debe ser un número formado por uno o varios dígitos.',
        'javax.faces.converter.FloatConverter.FLOAT_detail': '{2}: \'{0}\' debe ser un número entre 1.4E-45 y 3.4028235E38  Ejemplo: {1}',
        'javax.faces.converter.DateTimeConverter.DATE': '{2}: \'{0}\' no se ha podido reconocer como fecha.',
        'javax.faces.converter.DateTimeConverter.DATE_detail': '{2}: \'{0}\' no se ha podido reconocer como fecha. Ejemplo: {1}',
        'javax.faces.converter.DateTimeConverter.TIME': '{2}: \'{0}\' no se ha podido reconocer como hora.',
        'javax.faces.converter.DateTimeConverter.TIME_detail': '{2}: \'{0}\' no se ha podido reconocer como hora. Ejemplo: {1}',
        'javax.faces.converter.DateTimeConverter.DATETIME': '{2}: \'{0}\' no se ha podido reconocer como fecha y hora.',
        'javax.faces.converter.DateTimeConverter.DATETIME_detail': '{2}: \'{0}\' no se ha podido reconocer como fecha y hora. Ejemplo: {1}',
        'javax.faces.converter.DateTimeConverter.PATTERN_TYPE': '{1}: debe especificarse el atributo \'pattern\' o \'type\' para convertir el valor \'{0}\'',
        'javax.faces.converter.NumberConverter.CURRENCY': '{2}: \'{0}\' no se ha podido reconocer como un valor de divisa.',
        'javax.faces.converter.NumberConverter.CURRENCY_detail': '{2}: \'{0}\' no se ha podido reconocer como un valor de divisa. Ejemplo: {1}',
        'javax.faces.converter.NumberConverter.PERCENT': '{2}: \'{0}\' no se ha podido reconocer como porcentaje.',
        'javax.faces.converter.NumberConverter.PERCENT_detail': '{2}: \'{0}\' no se ha podido reconocer como porcentaje. Ejemplo: {1}',
        'javax.faces.converter.NumberConverter.NUMBER': '{2}: \'{0}\' no se ha podido reconocer como fecha.',
        'javax.faces.converter.NumberConverter.NUMBER_detail': '{2}: \'{0}\' no es un número. Ejemplo: {1}',
        'javax.faces.converter.NumberConverter.PATTERN': '{2}: \'{0}\' no es un patrón numérico.',
        'javax.faces.converter.NumberConverter.PATTERN_detail': '{2}: \'{0}\' no es un patrón numérico. Ejemplo: {1}',
        'javax.faces.validator.LengthValidator.MINIMUM': '{1}: Error de validación: el largo es inferior que el mínimo permitido de \'{0}\'',
        'javax.faces.validator.LengthValidator.MAXIMUM': '{1}: Error de validación: el largo es mayor que el máximo permitido de \'{0}\'',
        'javax.faces.validator.RegexValidator.PATTERN_NOT_SET': 'Se debe establecer el patrón de Regex.',
        'javax.faces.validator.RegexValidator.PATTERN_NOT_SET_detail': 'El patrón Regex debe establecerse en un valor no vacío.',
        'javax.faces.validator.RegexValidator.NOT_MATCHED': 'El patrón Regex no coincide',
        'javax.faces.validator.RegexValidator.NOT_MATCHED_detail': 'El patrón Regex de \'{0}\' no coincide',
        'javax.faces.validator.RegexValidator.MATCH_EXCEPTION': 'Error en expresión regular.',
        'javax.faces.validator.RegexValidator.MATCH_EXCEPTION_detail': 'Error en expresión regular, \'{0}\'',
        //optional for bean validation integration in client side validation
        'javax.faces.validator.BeanValidator.MESSAGE': '{0}',
        'javax.validation.constraints.AssertFalse.message': 'debe ser falso',
        'javax.validation.constraints.AssertTrue.message': 'debe ser verdadero',
        'javax.validation.constraints.DecimalMax.message': 'debe ser menor que o igual a {0}',
        'javax.validation.constraints.DecimalMin.message': 'debe ser mayor que o igual a {0}',
        'javax.validation.constraints.Digits.message': 'valor numérico fuera de los límites (se esperaba (<{0} digitos>.<{1} digitos>)',
        'javax.validation.constraints.Future.message': 'debe ser una fecha futura',
        'javax.validation.constraints.Max.message': 'debe ser menor que o igual a {0}',
        'javax.validation.constraints.Min.message': 'debe ser mayor que o igual a {0}',
        'javax.validation.constraints.NotNull.message': 'no debe ser nulo',
        'javax.validation.constraints.Null.message': 'debe ser nulo',
        'javax.validation.constraints.Past.message': 'debe ser una fecha pasada',
        'javax.validation.constraints.Pattern.message': 'debe coincidir con "{0}"',
        'javax.validation.constraints.Size.message': 'el tamaño debe estar entre {0} y {1}'
    }
};


