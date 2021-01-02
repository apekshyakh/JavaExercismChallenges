//Translate RNA sequences into proteins.
//AUG	Methionine
//UUU, UUC	Phenylalanine
//UUA, UUG	Leucine
//UCU, UCC, UCA, UCG	Serine
//UAU, UAC	Tyrosine
//UGU, UGC	Cysteine
//UGG	Tryptophan
//UAA, UAG, UGA	STOP

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    public List<String> translate(String rnaSeq) {
        Map<String, String> codons = new HashMap<>(
                Map.ofEntries(
                        Map.entry("AUG", "Methionine"),
                        Map.entry("UUU", "Phenylalanine"),
                        Map.entry("UUC", "Phenylalanine"),
                        Map.entry("UUA", "Leucine"),
                        Map.entry("UUG", "Leucine"),
                        Map.entry("UCU", "Serine"),
                        Map.entry("UCC", "Serine"),
                        Map.entry("UCA", "Serine"),
                        Map.entry("UCG", "Serine"),
                        Map.entry("UAU", "Tyrosine"),
                        Map.entry("UAC", "Tyrosine"),
                        Map.entry("UGU", "Cysteine"),
                        Map.entry("UGC", "Cysteine"),
                        Map.entry("UGG", "Tryptophan"),
                        Map.entry("UAA", "STOP"),
                        Map.entry("UAG", "STOP"),
                        Map.entry("UGA", "STOP")
                )
        );
        List<String> proteins = new ArrayList<>();

        for(int i=0; i<rnaSeq.length(); i+=3){
           String codon = codons.get(rnaSeq.substring(i,i+3));

           if(codon.equals("")||codon.equals("STOP")) break;
           proteins.add(codon);

       }
    return proteins;
    }
}
