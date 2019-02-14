package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by semvv on 13/02/2019.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"login", "password", "clientKind"})
public class Login {
    private String deviceUDID;
    private String applicID;

    private String clientKind;
    private String login;
    private String password;
    private String browser;
    private String browserVersion;
    private String platform;
    private String clientTimeZone;
}
