package uz.pdp.appclickuppdpversion.payload;

import lombok.Data;
import uz.pdp.appclickuppdpversion.entity.enums.AddType;

import java.util.UUID;

@Data
public class MemberDTO {
    private UUID id;

    private UUID roleId;

    private AddType addType;//ADD, EDIT, REMOVE
}
