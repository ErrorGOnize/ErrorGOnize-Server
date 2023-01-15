package io.errorgonize.note.store.logic;

import io.errorgonize.note.entity.Note;
import io.errorgonize.note.store.NoteStore;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class NoteStoreLogic implements NoteStore {
    private Map<Integer, Note> noteMap;

    public NoteStoreLogic() { this.noteMap = new HashMap<>(); }

    @Override
    public int create(Note newNote) {
        this.noteMap.put(newNote.getNote_no(), newNote);
        return newNote.getNote_no();
    }

    @Override
    public void update(Note newNote) {
        this.noteMap.put(newNote.getNote_no(), newNote);
    }

    @Override
    public void delete(int note_no) {
        this.noteMap.remove(note_no);
    }

    @Override
    public Note retrieve(int note_no) {
        return this.noteMap.get(note_no);
    }

    @Override
    public List<Note> retrieveAll() {
        return this.noteMap.values().stream().collect(Collectors.toList());
    }
}
