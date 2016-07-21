/**
 * Created by Dawid Stankiewicz on 17.07.2016
 */
package com.github.szczypioreg.forum.service;

import java.util.List;

import com.github.szczypioreg.forum.domain.Section;

public interface SectionService {
    
    List<Section> findAll();
    
    Section findOne(int id);
    
    Section findByName(String name);
    
    void save(Section section);
    
    void delete(int id);
    
    void delete(Section section);
    
}
