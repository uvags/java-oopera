import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Актёр уже числится в списке.");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        System.out.println("Актёрский состав:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public int findFirstEncounterOfActorSurname(String surname) {
        int index = -1;
        for (int i = 0; i != listOfActors.size(); ++i) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public void replaceActor(Actor newActor, String surnameOfReplaced) {
        int index = findFirstEncounterOfActorSurname(surnameOfReplaced);
        if (index != -1) {
            listOfActors.remove(index);
            listOfActors.add(newActor);
        } else {
            System.out.println("Актёрский состав не имеет человека с введенной фамилией.");
        }
    }

}
