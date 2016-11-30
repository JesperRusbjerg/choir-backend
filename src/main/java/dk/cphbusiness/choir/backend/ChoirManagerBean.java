/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.choir.backend;

import dk.cphbusiness.choir.contract.ChoirManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Stateless;

/**
 *
 * @author AKA
 */
@Stateless
public class ChoirManagerBean implements ChoirManager {

  @Override
  public Collection<MemberSummary> listMembers() {
    return new ArrayList<MemberSummary>() {{
        add(new MemberSummary(7, "Anders", "Hansen", "bass"));
        add(new MemberSummary(17, "Kurt", "Jensen", "tenor"));
        }};
    }

  @Override
  public MemberDetail findMember(MemberIdentifier id) {
    throw new UnsupportedOperationException("No support for dk.cphbusiness.choir.backend.ChoirManagerBean#findMember");
    }

  @Override
  public void saveMember(MemberDetail member) {
    throw new UnsupportedOperationException("No support for dk.cphbusiness.choir.backend.ChoirManagerBean#saveMember");
    }

  // Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Business Method")

  @Override
  public String sayHello(String name) {
    return "Hello to "+name+" from Remote Choir Backend";
    }
  
  }
