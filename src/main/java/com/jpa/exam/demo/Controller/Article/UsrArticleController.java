package com.jpa.exam.demo.Controller.Article;

import java.util.ArrayList;
import java.util.List;

import com.jpa.exam.demo.vo.Article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UsrArticleController {
    @RequestMapping("/usr/article/doAdd")
    @ResponseBody
    public Article doAdd(String title, String body) {
        int id = 1;
        Article article = new Article(id, title, body);

        return article; 
    }
    @RequestMapping("/usr/article/getArticles")
    @ResponseBody
    public List<Article> getArticles() {
        Article article1 = new Article(1, "제목", "내용");
        Article article2 = new Article(2, "제목2", "내용2");

        List<Article> list = new ArrayList<>();
        list.add(article1);
        list.add(article2);
        
        return list; 
    }
    @RequestMapping("/usr/article/write")
    public String write() {
        
    return "usr/article/write"; 
    }

}
