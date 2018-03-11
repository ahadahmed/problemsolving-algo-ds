package com.maico.f8;

import java.nio.charset.Charset;

import javax.swing.plaf.multi.MultiRootPaneUI;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import it.unimi.dsi.fastutil.HashCommon;
import net.agkn.hll.HLL;

public class ReadingLargeFile {
	
	public void hashing() {
		final int seed = 123456;
		
		HashFunction hashFunction = Hashing.murmur3_128();
		long numberOfElements = 100_000_000;
		long toleratedDifference = 1_000_000;
		long hashedValue = hashFunction.newHasher().putString("test",Charset.defaultCharset()).hash().asLong();
		HLL hll = new HLL(14, 5);
		
		
//		final HLL hll = new HLL(13/*log2m*/, 5/*registerWidth*/);
		hll.addRaw(hashedValue);
		long cardinality = hll.cardinality();
	}

}
