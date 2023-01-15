package io.errorgonize.note.service.logic;

import io.errorgonize.note.entity.Note;
import io.errorgonize.note.service.NoteService;
import io.errorgonize.note.store.NoteStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceLogic implements NoteService {
    private final NoteStore noteStore;

    @Override
    public int register(Note newNote) {
        return this.noteStore.create(newNote);
    }

    @Override
    public void modify(Note newNote) {
        this.noteStore.update(newNote);
    }

    @Override
    public void remove(int note_no) {
        this.noteStore.delete(note_no);
    }

    @Override
    public Note find(int note_no) {
        return this.noteStore.retrieve(note_no);
    }

    @Override
    public List<Note> findAll() {
        return this.noteStore.retrieveAll();
    }
}
