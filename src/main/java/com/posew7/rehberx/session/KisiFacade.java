package com.posew7.rehberx.session;

import com.posew7.rehberx.entity.Kisi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class KisiFacade extends AbstractFacade<Kisi> {

    @PersistenceContext(unitName = "com.posew7_Rehberx_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KisiFacade() {
        super(Kisi.class);
    }

}
