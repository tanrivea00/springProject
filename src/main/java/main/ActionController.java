package main;

import model.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActionController {
    @Autowired
    public ActionService actionService;


    @RequestMapping("/actions")
    public List<Action> getAllActions(){
        return actionService.getAllActions();
    }


    @RequestMapping("/actions/{id}")
    public Action getAction(@PathVariable String id){
       return ActionService.getAction(id);
    }

    @RequestMapping(method = RequestMethod.POST, value= "/actions")
    public void addAction(@RequestBody Action action){
     actionService.addAction(action);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "/actions/{id}")
    public void updAction(@RequestBody Action action,@PathVariable String id){
        actionService.updAction(action,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/actions/{id}")
    public void delAction(@PathVariable String id){
        actionService.delAction(id);
    }
}


