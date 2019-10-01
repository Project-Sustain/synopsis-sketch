package sustain.synopsis.sketch.adapters;

import sustain.synopsis.sketch.query.MetaQuery;
import sustain.synopsis.sketch.query.Query;
import sustain.synopsis.sketch.serialization.SerializationException;
import sustain.synopsis.sketch.serialization.SerializationInputStream;
import sustain.synopsis.sketch.query.QueryCreator;
import sustain.synopsis.sketch.query.QueryWrapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class QueryTest {

    public static void main(String[] args) throws Exception {

        QueryWrapper qw = QueryCreator.create();
        String q = getSQLFormat(qw);
        System.out.println(q);
    }

    public static String getSQLFormat(QueryWrapper qw) throws IOException, SerializationException {
        ByteArrayInputStream bIn = new ByteArrayInputStream(qw.payload);
        SerializationInputStream sIn = new SerializationInputStream(bIn);
        sIn.readByte();
        Query q = new MetaQuery(sIn);
        sIn.close();
        return q.toString();
    }
}
