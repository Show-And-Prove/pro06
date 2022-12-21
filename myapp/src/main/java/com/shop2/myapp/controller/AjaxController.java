package com.shop2.myapp.controller;

import com.shop2.myapp.dto.SampleDto;
import com.shop2.myapp.dto.UserDto;
import com.shop2.myapp.service.AjaxService;
import com.shop2.myapp.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/ajax/")
public class AjaxController {
    @Autowired
    AjaxService ajaxService;

    @Autowired
    HttpSession session;

    @GetMapping("test1")
    public String testLoad(Model model) throws Exception {
        return "ajax/test1";
    }






    @GetMapping("list")
    public String userList1(Model model) throws Exception{
        List<UserDto> list = ajaxService.userList();
        model.addAttribute("list", list);
        return "ajax/list";
    }

    @GetMapping("idCheck.do")
    @ResponseBody
    public boolean idCheck(@RequestParam("id") String id, Model model) throws Exception{

        UserDto user = ajaxService.getUser(id);
        //DB에서 검증한 후 분기하여 return값 설정
        if (user == null) {
            return true;    //생성가능한 id
        } else {
            return false;   //중복 id
        }
    }

    @GetMapping("test2")
    public String testLoad2(Model model) throws Exception {
        return "ajax/test2";
    }

    @GetMapping("userList.do")
    @ResponseBody
    public List<UserDto> userList(Model model) throws Exception{
        List<UserDto> userList = ajaxService.userList();
        return userList;
    }

    @GetMapping("test3")
    public String testLoad3(Model model) throws Exception {
        return "ajax/test3";
    }

    @GetMapping("getUser.do")
    @ResponseBody
    public UserDto getUser(@RequestParam("id") String id) throws Exception {
        UserDto user = ajaxService.getUser(id);
        return user;
    }

    @GetMapping("test4")
    public String testLoad4(Model model) throws Exception {
        return "ajax/test4";
    }

/*    @PostMapping("getLogin.do")
    @ResponseBody
    public UserDto getLogin(@ModelAttribute("user") UserDto user, Model model) throws Exception {
        UserDto usr = ajaxService.getLogin(user.getId(), user.getPw());
        if(usr == null) {
            session.invalidate();
        } else {
            session.setAttribute("sid", usr.getId());
        }
        return session;
    }*/

    @GetMapping("getLogin.do")
    @ResponseBody
    public UserDto getLogin(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {
        UserDto usr = ajaxService.getLogin(id, pw);
        if(usr == null) {
            session.invalidate();
        } else {
            session.setAttribute("sid", usr.getId());
        }
        return usr;
    }

}
