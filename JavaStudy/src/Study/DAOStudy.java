package Study;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class DAOStudy {
	public static int selectListCount(DBConection DBCon, boardDTO boardDTO) throws SQLException, Exception {

		/* ログ出力用 */
		final String METHODNAME = Thread.currentThread().getStackTrace()[1].getMethodName();

		LogCommon.logWrite("", LogCommon.TYPE_DEBUG, "", CLASSNAME, METHODNAME, LogCommon.getLineNumber(),
				LogCommon.LOG_START, "", "");

		/* SQL */
		StringBuffer buf = new StringBuffer();
		buf.append(" SELECT  ");
		buf.append(" 	COUNT(*)  ");
		buf.append(" FROM  ");
		buf.append(" 	EXAMSITE ");
		buf.append(" WHERE	 ");
		buf.append(" 	BOARDID = #{boardID} ");
		buf.append(" 	AND (BOARDTITLE = '%'||#{keyword}||'%' OR BOARDCONTENT = '%'||#{keyword}||'%') ");
		  

		/* 파라메터 */
        List<Object> param = new ArrayList<Object>();
        param.add(boardDTO.getCompanynm());
		param.add(boardDTO.getSimeinm());
		param.add(boardDTO.getBengokantecd());
		param.add(boardDTO.getIraisyo_registdate());
		param.add(boardDTO.getKyoyu_hyoujigaiflg());
		param.add(boardDTO.getDeleteflg());
		param.add(boardDTO.getUpdate_usercd());
		param.add(boardDTO.getUpdate_dtm());	
		param.add(boardDTO.getJikonendo());
		param.add(boardDTO.getJikono());
		param.add(boardDTO.getKyosaisyukbn());
		param.add(boardDTO.getHigaino());
		param.add(boardDTO.getKankeino());
		
		int resultCount = 0;

		/* ステートメントオブジェクト取得 */
		try(PreparedStatement preState = DBCon.getPrepareStatement(buf.toString());){
			DBCon.setPrepareParameter(param, preState);

			/* SQL発行 */
			String logSQL = StringConvertUtil.getPreparedSQL(buf.toString(), param);
			LogCommon.logWrite("", LogCommon.TYPE_SQL, "", CLASSNAME, METHODNAME, LogCommon.getLineNumber(),
					"SQL=[" + logSQL + "]", "", "");

					resultCount += preState.executeUpdate();

			}

		}

		LogCommon.logWrite("", LogCommon.TYPE_DEBUG, "", CLASSNAME, METHODNAME, LogCommon.getLineNumber(),
				LogCommon.LOG_END, "", "");

		return resultCount;
	}
}
