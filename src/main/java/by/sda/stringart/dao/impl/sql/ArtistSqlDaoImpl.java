package by.sda.stringart.dao.impl.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import by.sda.stringart.bean.artists.Artist;
import by.sda.stringart.dao.ArtistDao;
import by.sda.stringart.dao.util.DBConnectionHelper;
import static by.sda.stringart.dao.util.SqlRequestPool.*;

public class ArtistSqlDaoImpl implements ArtistDao{
	
//TODO replace print stack trace to logger
	public ArtistSqlDaoImpl() {
		super();
	}

	@Override
	public void create(Artist entity) {
		Connection cn = DBConnectionHelper.connect();
		try (PreparedStatement ps = cn.prepareStatement(SQL_CREATE_NEW_ARTIST)) {
			initParametres(ps, entity);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
	}
	
	private void initParametres(PreparedStatement ps, Artist entity) throws SQLException {
		ps.setString(1, entity.getName() );
		ps.setString(2, entity.getSurname() );
		Date date = new Date(entity.getBirthday().getTime());
		ps.setDate(3, date);
		ps.setString(4, entity.getStyle() );
	}

	@Override
	public Artist read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Artist entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Artist entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Artist> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
