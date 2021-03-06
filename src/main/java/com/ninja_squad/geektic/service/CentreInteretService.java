package com.ninja_squad.geektic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import com.ninja_squad.geektic.DAO.CentreInteretDAO;
import com.ninja_squad.geektic.DAO.GeekDAO;
import com.ninja_squad.geektic.domaine.CentreInteret;

@RestController
@Transactional
@RequestMapping("/centre-interet")
public class CentreInteretService {
	@Autowired
	private CentreInteretDAO CentreInteretDAO;
	
	@RequestMapping(value="/list",method = GET)
    public List<CentreInteret> listInterets() {
        return CentreInteretDAO.findAll();
    }
}
