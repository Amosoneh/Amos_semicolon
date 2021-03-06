package chapter8;

import java.time.LocalDate;
import java.util.ArrayList;


public class Diary {
    String name;
    private final LocalDate dateCreated = LocalDate.now();
    private ArrayList<Entry> entries = new ArrayList<>();


    public Diary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateCreated(){
        return dateCreated;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void createEntry(Entry newEntry){
        for (Entry entry : entries) {
            if (entry.getTitle().equals(newEntry.getTitle())) {
                throw new IllegalArgumentException("Entry already exists with same title");
            }
        }
        this.entries.add(newEntry);

    }

    public Entry getEntry(String id){
        return findEntry(id);
    }

    public ArrayList<Entry> getAllEntries(){
        return entries;
    }

    public void editEntry(String id, String body){
        Entry entryToEdit = findEntry(id);
        entryToEdit.setBody(body);
    }

    public void deleteEntry(String id){
        Entry entryToDelete = findEntry(id);
        entries.remove(entryToDelete);
    }

    private Entry findEntry(String id) {
        int entryIndex = -1;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getId().equals(id)) {
                entryIndex = i;
                break;
            }
        }
        if (entryIndex == -1) {
            throw new IllegalArgumentException("Entry with id" + id + "not found");
        }
        return entries.get(entryIndex);
    }

    @Override
    public String toString(){
        return ("Name: "+ getName()+
                "\nDate Created: "+ getDateCreated()
                );
    }
}
