package io.errorgonize.note.service;

import io.errorgonize.note.entity.Note;

import java.util.List;

public interface NoteService {
    int register(Note newNote);
    void modify(Note newNote);
    void remove(int note_no);

    Note find(int note_no);
    List<Note> findAll();
}
