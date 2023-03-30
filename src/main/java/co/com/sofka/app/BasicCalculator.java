package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long sub(Long number1, Long number2) {
        logger.info( "Sub {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mul(Long number1, Long number2) {
        logger.info( "Mul {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        logger.info( "Div {} / {}", number1, number2 );
        if(0 == number2){
            throw  new IllegalArgumentException("No se puede dividir por cero");
        }
        return number1 / number2;
    }
}
