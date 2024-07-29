/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.dao.custome;

import librarymanagement.dao.CrudDao;
import librarymanagement.dao.SuperDao;
import librarymanagement.entity.BorrowinDetailsEntity;


/**
 *
 * @author ayesh
 */
public interface BorrwoingBookDetailDao extends CrudDao<BorrowinDetailsEntity, Object>{
    public boolean  deletBorrowDetail(String bookId,String borrowId) throws Exception;
}
