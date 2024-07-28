/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.services.custom;

import java.util.List;
import librarymanagement.dto.MemberDto;
import librarymanagement.services.SuperService;

/**
 *
 * @author ayesh
 */
public interface MemberService extends SuperService{
    String saveMember(MemberDto dto)throws Exception;
    String updateMember(MemberDto dto)throws Exception;
    String deleteMember(String Id)throws Exception;
    MemberDto getMemberById(String Id)throws Exception;
    List<MemberDto> getMemberList()throws Exception;
    
}
