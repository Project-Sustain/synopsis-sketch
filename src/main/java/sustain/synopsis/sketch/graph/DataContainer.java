package sustain.synopsis.sketch.graph;

import java.io.IOException;

import sustain.synopsis.sketch.serialization.ByteSerializable;
import sustain.synopsis.sketch.serialization.SerializationInputStream;
import sustain.synopsis.sketch.serialization.SerializationOutputStream;
import sustain.synopsis.sketch.stat.RunningStatisticsND;

public class DataContainer implements ByteSerializable {

    public RunningStatisticsND statistics;

    public DataContainer() {
        this.statistics = new RunningStatisticsND();
    }

    public DataContainer(RunningStatisticsND statistics) {
        this.statistics = statistics;
    }

    public void merge(DataContainer container) {
        statistics.merge(container.statistics);
    }

    public void clear() {
        statistics.clear();
    }

    @Deserialize
    public DataContainer(SerializationInputStream in)
    throws IOException {
        statistics = new RunningStatisticsND(in);
    }

    @Override
    public void serialize(SerializationOutputStream out)
    throws IOException {
        statistics.serialize(out);
    }
}
