/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.contoller;

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
    

    public String save(MemberDto dto) throws Exception{
        
        return servie.saveMember(dto);
    }

}
