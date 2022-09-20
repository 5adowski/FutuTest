package sadowski.wojciech.futuTest.campaign;

import lombok.Data;
import org.springframework.stereotype.Component;
import sadowski.wojciech.futuTest.status.Status;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Component
public class Campaign {
    private Long id;
    private String name;
    @NotNull
    private String[] keyWords;
    @NotNull
    @Min(5000)
    private BigDecimal bid;
    @NotNull
    private BigDecimal fund;
    @NotNull
    private Status status;
    private String town;
    @NotNull
    private BigDecimal radius;
}
