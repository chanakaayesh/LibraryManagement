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
  public  String saveMember(MemberDto dto)throws Exception;
  public  String updateMember(MemberDto dto)throws Exception;
  public  String deleteMember(String Id)throws Exception;
  public  MemberDto getMemberById(String Id)throws Exception;
  public  List<MemberDto> getMemberList()throws Exception;
    
}
