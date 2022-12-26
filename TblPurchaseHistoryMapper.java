package jp.co.internous.kingdom.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.kingdom.model.domain.dto.PurchaseHistoryDto;

@Mapper
public interface TblPurchaseHistoryMapper {
	
	int insert(@Param("destinationId") int destinationId, @Param("userId") int userId);
	
	List<PurchaseHistoryDto> findHistory(int userId);
	
	@Update("UPDATE tbl_Purchase_history SET status=0, updated_at = now() WHERE user_id= #{userid}")
	int deleteId(int userid);

}

