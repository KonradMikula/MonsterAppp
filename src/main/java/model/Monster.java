package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Component
public class Monster {
    private String name;
    private String pictureURL;
    private boolean sugar;

}
