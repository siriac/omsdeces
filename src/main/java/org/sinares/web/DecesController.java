package org.sinares.web;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.sinares.dao.IASRepository;
import org.sinares.dao.IAnnexeRepository;
import org.sinares.dao.IDistrictRepository;
import org.sinares.dao.IEtabliFosaRepository;
import org.sinares.dao.IMaladieRepository;
import org.sinares.dao.IRegionRepository;
import org.sinares.dao.IUserRepository;
import org.sinares.dao.IpersonneRepository;
import org.sinares.entities.Aire_de_Sante;
import org.sinares.entities.Annexe_2;
import org.sinares.entities.Causes_deces;
import org.sinares.entities.District;
import org.sinares.entities.Etablissement_FOSA;
import org.sinares.entities.Maladie;
import org.sinares.entities.Personne;
import org.sinares.entities.Region;
import org.sinares.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecesController {
	/*
	 * @Autowired permet de faire l'injection de dependance avec spring
	 * Quand on met autowired on demande a spring cherche moi un object qui implemente produitRepository
	 * tu vas l injecter dans cette classe
	 */
	@Autowired
   private IRegionRepository iRegionRepository;//on a besoin de ca pour avoir acces a la couche metier
	@Autowired
	private IDistrictRepository iDistrictRepository;
	@Autowired
	private IASRepository iASRepository;
	@Autowired
	private IEtabliFosaRepository iEtabliFosaRepository;
	@Autowired
	private IAnnexeRepository iAnnexeRepository;
	@Autowired
	private IMaladieRepository iMaladieRepository;
	@Autowired
	private IpersonneRepository iPersonneRepository;
	@Autowired
	private IUserRepository iUserRepository;
	
	/*
     * pour acceder a cette methode je vais utiliser une annotation qui s'appele @RequestMapping
     * ca veut dire quoi?si je tape http:localhost:8080/index c est la methode index qui s excutera
     * si on veut specifier la methode qui sera utilisee on tape method=RequestMethod.Get ou POst
     * la on imposse la methode
     */
    @RequestMapping(value="/SaveRegion")
    public Region Accueil(Region reg)
    {
    	System.out.println("nombre de produit:");
    	iRegionRepository.save(reg);
    	return reg;
    }
    @RequestMapping(value="/allregions",method=RequestMethod.GET)
    public List<Region> AllRegion()
    {
    	System.out.println("Enregistrement de la district :");
    	return iRegionRepository.findAll();
    }
    @RequestMapping(value="/SaveDistrict")
    public District SaveDistrict(District dis)
    {
    	System.out.println("Enregistrement de la district :");
    	iDistrictRepository.save(dis);
    	return dis;
    }
    @RequestMapping(value="/alldistrict")
    public List<District> AllDistrict()
    {
    	System.out.println("Tous les district :");
    	return iDistrictRepository.findAll();
    }
    @RequestMapping(value="/allDistrictByRegion")
    public List<District> AllDistrict(String regionName)
    {
    	Region reg=iRegionRepository.findByNomRegion(regionName);
    	System.out.println("recherche par nom :"+reg.getCodeRegion()+" "+reg.getIdRegion()+" "+iDistrictRepository.findparid_region(reg.getIdRegion()).size());
    	return iDistrictRepository.findparid_region(reg.getIdRegion());
    }
    @RequestMapping(value="/SaveAS")
    public Aire_de_Sante SaveAS(Aire_de_Sante as)
    {
    	System.out.println("Aire de sante :");
    	iASRepository.save(as);
    	return as;
    }
    
    @RequestMapping(value="/allASByDistrict")
    public List<Aire_de_Sante> AllASByDistrict(String districtCode)
    {
    	District dis=iDistrictRepository.findByCodeDistrict(districtCode);
    	System.out.println("recherche district par nom :"+dis.getCodeDistrict()+" "+dis.getIdDistrict()+" "+iASRepository.getASbyDistric(dis.getIdDistrict()).size());
    	return iASRepository.getASbyDistric(dis.getIdDistrict());
    }
    
    @RequestMapping(value="/allAS")
    public List<Aire_de_Sante> AllAS()
    {
    	System.out.println("tous les Aire de sante :");
    	return iASRepository.findAll();
    }
    @RequestMapping(value="/SaveFOSA")
    public Etablissement_FOSA SaveEtabFOSA(Etablissement_FOSA fosa)
    {
    	System.out.println("Etablissement fosa :");
    	iEtabliFosaRepository.save(fosa);
    	return fosa;
    }
    @RequestMapping(value="/allFOSA")
    public List<Etablissement_FOSA> AllFOSA()
    {
    	System.out.println("tous les Etablissement FOSA :");
    	return iEtabliFosaRepository.findAll();
    }
    @RequestMapping(value="/SaveAnnexe",method=RequestMethod.POST)
    public @ResponseBody Annexe_2 SaveEtabFOSA(@RequestBody Annexe_2 annexe)
    {
    	System.out.println("Enregistrement annexe :");
    	/*for(Maladie m:annexe.getMaladies())
    	{
    		System.out.println(m.getNom_maladie()+" "+m.getIdMaladie());
    	}*/
    	iAnnexeRepository.save(annexe);
    	return annexe;
    }
    @RequestMapping(value="/AllAnnexe")
    public List<Annexe_2> AllAnnexe()
    {
    	System.out.println("tous les Etablissement FOSA :");
    	return iAnnexeRepository.findAll();
    }
    @RequestMapping(value="/SaveMaladie")
    public Maladie SaveEtabFOSA(Maladie maladie)
    {
    	System.out.println("Etablissement fosa :");
    	iMaladieRepository.save(maladie);
    	return maladie;
    }
    @RequestMapping(value="/AllMaladie")
    public List<Maladie> AllMaladie()
    {
    	System.out.println("tous les Etablissement FOSA :");
    	return iMaladieRepository.findAll();
    }
    @RequestMapping(value="/SavePersonne")
    public Personne SavePerson(Personne personne)
    {
    	System.out.println("Etablissement fosa :");
    	iPersonneRepository.save(personne);
    	return personne;
    }
    @RequestMapping(value="/AllPerson")
    public List<Personne> AllPersons()
    {
    	System.out.println("tous les Etablissement FOSA :");
    	return iPersonneRepository.findAll();
    }
    @RequestMapping(value="/EtabByDist")
    public List<Etablissement_FOSA> EtabByDist(String codeDistrict)
    {
    	System.out.println("tous les Etablissement FOSA :");
    	District d=iDistrictRepository.findByCodeDistrict(codeDistrict);
    	System.out.println("recherche district par nom :"+d.getCodeDistrict()+" "+d.getIdDistrict()+" "+iEtabliFosaRepository.findByDistrict(d.getIdDistrict()).size());
    	return iEtabliFosaRepository.findByDistrict(d.getIdDistrict());
    }
    
    @RequestMapping(value="/Authen")
    public User Auth(String name,String password)
    {
    	System.out.println("Authentification :"+" "+"Nom:"+iUserRepository.findUser(name, password).getUserName()+" "+iUserRepository.findUser(name, password).getPassword());
    	
    	return iUserRepository.findUser(name, password);
    }
    @RequestMapping(value="/AllUsers")
    public List<User> AllUsers()
    {
    	System.out.println("Authentification :"+iUserRepository.findAll().size());
    	
    	return iUserRepository.findAll();
    }
    @RequestMapping(value="/SaveUser",method=RequestMethod.POST)
    public User SaveUser(@RequestBody User user)
    {
    	System.out.println("Enregistrement utilisateur :");
    	
    	return iUserRepository.save(user);
    }
   
   /* @RequestMapping(value="/chercher",method=RequestMethod.GET)
    public String Chercher(Model model,
    		@RequestParam(name="motcle",defaultValue="") String motcle,
    		@RequestParam(name="page",defaultValue="0")int page)
    {
    	System.out.println("nombre de produit:");
    	//List<Produit> produits=produitRepository.findAll();
    	Page<Produit> pageProduits=produitRepository.chercherProduit("%"+motcle+"%",new PageRequest(page, 5));
    	model.addAttribute("pageproduit",pageProduits);
    	model.addAttribute("pageCourant",page);
    	model.addAttribute("motcle",motcle);
    	int[] pages=new int [pageProduits.getTotalPages()];
    	for(int i=0;i<pages.length;i++) pages[i]=i;
    	model.addAttribute("pages",pages);
    	return "produits";
    }
    @RequestMapping(value="/form")
    public String formProduit(Model model)
    {
    	model.addAttribute("produit",new Produit());
    	return "formProduit";
    }
    @RequestMapping(value="/saveProduit",method=RequestMethod.POST)
    /*
     * @Valid veut dire que on demande a spring quand il va stocker les données dans produit il va 
     * faire la validation c'est-a- dire il va analyser les anotations est ce q les données respectent
     * les données definies avec les annotations?s il y a les erreurs spring va stocker les erreurs
     * dans un object BindingResult
     */ 
 /*   public String save(Model model,@Valid Produit p,BindingResult bindingResult)
    {
    	if(bindingResult.hasErrors())
    	{
    		return "formProduit";
    	}
    	produitRepository.save(p);
    	model.addAttribute("produit",p);
    	return "confirmation";
    }*/
}
