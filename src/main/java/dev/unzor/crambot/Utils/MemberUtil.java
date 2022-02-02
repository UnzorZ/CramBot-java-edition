package dev.unzor.crambot.Utils;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;

import java.util.List;

public class MemberUtil {

    public static Role getRole(Member member, String name){
        List<Role> roles = member.getRoles();
        return roles
                .stream()
                .filter(role -> role.getName().equals(name)).findFirst()
                .orElse(null);
    }

}