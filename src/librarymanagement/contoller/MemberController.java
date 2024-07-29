/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.contoller;

import java.util.List;

import librarymanagement.dto.MemberDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.Servicefactor;
import librarymanagement.services.custom.MemberService;

/**
 *
 * @author ayesh
 */
public class MemberController {
    
    private MemberService servie =  (MemberService) Servicefactor.getInstance().getService(EnumContainer.ServiceType.MEMBER);
    
    private static MemberController instance;

    private MemberController() { }
    
    public static MemberController getInstance(){
    
        return instance==null? instance = new MemberController():instance;
    }

    public String save(MemberDto dto) throws Exception{
        
        return servie.saveMember(dto);
    }
    
    public String updateMember(MemberDto dto)throws Exception{
    
        return servie.updateMember(dto);
    }
    
    public String delateMember(String id)throws Exception{
    return servie.deleteMember(id);
    }
    
    public MemberDto getMemberByID(String Id)throws Exception{
        return servie.getMemberById(Id);
    }

     public List<MemberDto> getMemberList()throws Exception{
        return servie.getMemberList();
    }
}
