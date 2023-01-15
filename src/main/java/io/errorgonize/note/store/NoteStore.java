package io.errorgonize.note.store;

import io.errorgonize.note.entity.Note;

import java.util.List;

public interface NoteStore {
    int create(Note newNote);
    void update(Note newNote);
    void delete(int note_no);

    Note retrieve(int note_no);
    List<Note> retrieveAll();
}
