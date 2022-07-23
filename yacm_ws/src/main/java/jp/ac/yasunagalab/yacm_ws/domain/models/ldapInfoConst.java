package jp.ac.yasunagalab.yacm_ws.domain.models;

import java.util.Arrays;
import java.util.List;

public class ldapInfoConst {
    static final String gidNumber = "1001";
    static final String homeDirectory = "/home/people/"; // + uid
    static final String loginShell = "/bin/bash";
    static final List<String> objectClasses = Arrays.asList("account", "posixAccount");
}
