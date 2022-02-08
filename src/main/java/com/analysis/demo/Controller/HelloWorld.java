
package com.analysis.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    public String forDemo(){
        for(int i=0;i<10;i++){
            for(int j=0;j<5;j++){
                System.out.println(j);
            }

        }

        return "for循环深度demo";
    }

    public String tryDemo(){
        try{
            System.out.println("第一层");

            try{
                System.out.println("第二层");

            }catch(Exception e){

            }

        }catch(Exception e){

        }

        return "try深度demo";
    }

    
}
