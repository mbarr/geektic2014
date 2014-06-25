package com.ninja_squad.geektic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import javax.transaction.Transactional;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import com.ninja_squad.geektic.DAO.GeekDAO;
import com.ninja_squad.geektic.domaine.Geek;

@RestController
@Transactional
@RequestMapping("/geek")
public class GeekService {
	@Autowired
	private GeekDAO geekDAO;
	
	@RequestMapping(value="/list",method = GET)
    public List<Geek> listGeeks() {
        return geekDAO.findAll();
    }
	@RequestMapping(value="/profile/{idGeek}",method = GET)
    public Geek profile(@PathVariable("idGeek") long idGeek) {
        return geekDAO.findById(idGeek);
    }
}
