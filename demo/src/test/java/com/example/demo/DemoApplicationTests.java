package com.example.demo;

import com.example.demo.mytest.entity.MemberInfo;
import com.example.demo.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@ActiveProfiles("dev")
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        String str = "col: 1\n" +
                "appid: 1\n" +
                "webid: 2745\n" +
                "path: /\n" +
                "columnid: 1370364\n" +
                "sourceContentType: 1\n" +
                "unitid: 5920131\n" +
                "webname: 诸暨市政府门户网站\n" +
                "permissiontype: 0";

        String collect = Arrays.stream(str.split("\\n")).map(d -> {
            int ind = d.indexOf(":");
            String key = d.substring(0, ind).trim();
            String value = (d.length() == ind + 1) ? "" : d.substring(ind + 1);
            value = value.trim();

            String s = "\"" + key + "\"";
            if (value.matches("\\d+") || value.startsWith("\"")) {
                s = s + ":" + value;
            } else {
                s = s + ":\"" + value + "\"";
            }
            return s;
        }).filter(Objects::nonNull).collect(Collectors.joining(","));//.forEach(System.out::println);
        System.out.println("{" + collect + "}");
    }

    @Test
    void contextTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.forEach((id, value) -> {
            System.out.println(id);
            System.out.println(value);
        });
    }

    @Test
    void memberTest() {
        String name = "";//动态名称
        List<MemberInfo> memberInfoList = Lists.newArrayList();//从别人那获取的大list
        List<MemberInfo> MemberInfoList = memberInfoList.parallelStream().map(info -> {
            List<String> accountList = info.getAccountList().parallelStream().filter(account -> StringUtils.equals(account.getAttr_acc_open_name(), name))
                    .map(account -> account.getAttr_acc_open_name())
                    .collect(Collectors.toList());
            if (CollectionUtils.isEmpty(accountList)) {
                return info;
            }
            info.setOpenId(accountList.get(0));
            return info;
        }).collect(Collectors.toList());
    }

}
