package zx.soft.naive.bayes.mapred.txt;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class VerifyOfTxtToHdfsReducer extends Reducer<LongWritable, Text, LongWritable, Text> {

	@Override
	public void reduce(LongWritable key, Iterable<Text> values, Context context) throws InterruptedException,
			IOException {

		for (Text value : values) {
			context.write(key, value);
		}

	}

}