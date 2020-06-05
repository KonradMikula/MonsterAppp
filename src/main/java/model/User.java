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
public class User {
    private String email;
    private String Nick;
    private String password;
    private String Login;

}
