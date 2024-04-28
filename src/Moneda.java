public record Moneda (String result,
                      String time_next_update_utc,
                      String base_code,
                      String target_code,
                      String conversion_rate,
                      String conversion_result){

    @Override
    public String toString() {
        return "Operación: " + base_code + " => " + target_code + "\n"+
                "Tasa de Conversión: " + conversion_rate + " fecha de actualización: " + time_next_update_utc + "\n" +
                "Resultado de la converción: $ " + conversion_result +"\n\n";
    }
}
