package main;

import model.Action;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ActionService {

    public static List<Action>  actionList=new ArrayList<Action>(Arrays.asList(
            new Action("1","Action1","action_1"),
            new Action("2","Action2","action_2"),
            new Action("3","Action3","action_3")
    ));

    public List<Action> getAllActions(){
        return actionList;
    }

    public static Action getAction(String id)
    {
        return actionList.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addAction(Action action) {
        actionList.add(action);
    }

    public void updAction(Action action,String id) {
        for(int i = 0;i<actionList.size();i++)
        {
            Action act=actionList.get(i);
            if(act.getId().equals(id))
            {
                actionList.set(i,action);
            }
        }
    }

    public void delAction(String id) {
        actionList.removeIf(t->t.getId().equals(id));
    }
}
