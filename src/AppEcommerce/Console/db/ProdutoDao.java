package AppEcommerce.Console.db;

import AppEcommerce.Console.core.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDao implements IDataAccessObject<Produto> {
    private Connection conn;

    public ProdutoDao() {
        this.conn = new ConnectionFactory().getConnection();
    }

    @Override
    public void save(Produto obj) {
        String sql = "INSERT INTO produto (descricao,preco,peso,disponivel) VALUES (?,?,?,?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setDouble(3, obj.getPeso());
            stmt.setBoolean(4, obj.isDisponivel());

            stmt.execute();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Produto obj) {
        //TODO: Terminar a implementação destes métodos.

    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Produto> getAll() {
        return null;
    }
}
