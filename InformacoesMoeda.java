import java.util.Map;

public record InformacoesMoeda(
        String base_code,
        Map<String, Double> conversion_rates
) {}
