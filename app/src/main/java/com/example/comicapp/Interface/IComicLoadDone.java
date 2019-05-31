package com.example.comicapp.Interface;

import com.example.comicapp.Model.Comic;

import java.util.List;

public interface IComicLoadDone {
    void onComicLoadDoneListener(List<Comic> comicList);
}
