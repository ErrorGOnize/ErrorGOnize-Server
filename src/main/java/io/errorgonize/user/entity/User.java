/*package io.errorgonize.user.entity;

public class User {
}
*/
package io.errorgonize.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String name;
    private int id;
    private String intro;
    private String tag_p;
    private String tag_i;
    private String email;
    //img

}