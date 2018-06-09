/*
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package io.nuls.account.ledger.rpc;

import io.nuls.core.tools.log.Log;
import io.nuls.core.tools.str.StringUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TransferTest {

    public static List<String> getAddressList() {
        List<String> list = new ArrayList<>();
        list.add("2CbBjRyj4PdoRiDEVTZyk38QwohZRPr");
        list.add("2CVjhThvuH8rrduoiUaUZTrUE3JUiHA");
        list.add("2CYC8jkDW8hPNPUy6VTMK1SnzJ6S4nD");
        list.add("2ChJgymEZeuiCAD2bq2gJPG1xgSEmE1");
        list.add("2CbY1kwafpdQY8fAwgsaBF2ptYetKmQ");
        list.add("2CaDbrLw64it65g9xR5RMouuZxCxL8m");
        list.add("2CkJBdmzX5d1S3Wg8od3X4rmj61dYki");
        list.add("2CgPqb4TsfkUS1x7u1YZ6L2yfKWdCNE");
        list.add("2CctybFUgHkENmaPfjJaPzgqRJC6Tk9");
        list.add("2CcUqv3BB6VFisDdaP6JGJ84RSb7MTA");
        list.add("2ChuowSwN5PKsjfCsgeMqpJQzdxkVoB");
        list.add("2CdZ417Jx84Gp9mRWAahNjWe7hNFZUV");
        list.add("2CiUbDmj8ZwUuCMZkRR1MDS39paLSqd");
        list.add("2CeuTJQ63ox8ugm7P7ztHWuzFobc3fx");
        list.add("2CVbhb41nT748iLYLUSaApFSJ5GWk52");
        list.add("2CYMNxc8wCmvBGtHEVgzUJcihDMBZcZ");
        list.add("2CkJ7e7Uueyztj7hpsrvBNGNVpqEUfJ");
        list.add("2CW5Tph73rKV3gWGcDEDrscKDNs3coJ");
        list.add("2CXJnkarYdPh87aH5T3D3bKkYe4cR5C");
        list.add("2CZRePAdqUsoLt3Xvm4Ak1bvtMNFbcp");
        list.add("2CdjNpkJKs2Bh51hWqyR2buKUmfXMHx");
        list.add("2CjEcvkEPP4kPS8Nren9tbHY4Tjf6vG");
        list.add("2CaN17CztN1w6PLcbH6NujkJ3wSXHs9");
        list.add("2CgCmGB5wY8hcF3KqDuz3bcdgae17GF");
        list.add("2CYEPNo5W7BNn3pGvkidKGEwtJg8dv8");
        list.add("2CXiY56PYjPpT5VY7BhftTC8cSpnTuY");
        list.add("2CXDurb3VmZLcW9YKrWRV24zYhfyqo9");
        list.add("2CjwFai3Zasu1zvFj8MyEdYjADYvYiU");
        list.add("2Cb5yYfyHMFRAQvNbtvjtrXi1KeWHsN");
        list.add("2CWGDpaLGYEPpLhwDfCh12WwtVCTL97");
        list.add("2CVUCSVKMZLtDV5hcy4GLonG8865UTm");
        list.add("2Ca7F7zqhCGfswQYKA8UqbVhM43zXa6");
        list.add("2CYxTwDwRXYCw359ovm63JytxqAC6NB");
        list.add("2CiPrgLMzGoBSJDiF5DrtqDCsQofJf9");
        list.add("2CgXg61YkpYw5bmdqrKsTSD1J8oUmC2");
        list.add("2CeSfwrgtruHAW3pH5q8PpzBvXjmA3c");
        list.add("2ChdYG6zyue9oUd5TcwQqysZLu1ttor");
        list.add("2CXMiugAzgWpFQueWAJdF4dwCZmhtTq");
        list.add("2CbVUJXh17Vu2L2rUJpc6Yhwh41zkqe");
        list.add("2CXqeUwp1QgXv8ZLwte2HDZEsxX1Jny");
        list.add("2Cf3hBAuYXpkrRJD9dy579t7tQetoRQ");
        list.add("2CaDPFALYhmS4h1aAXJgYWb1X56vqQA");
        list.add("2CVA1rscmQyGitKA6oY5hLvMzD8UrCP");
        list.add("2CXrcnqX4FqX4LYykGhWgbJy3kn67iR");
        list.add("2CisjDVBgahKF3dYBeipGDT3yDBoDeV");
        list.add("2CjEmJRJDArEopJCCMpUoVXPpHEeBz5");
        list.add("2CatPGXkP6WHA3Pg4GfaZB79em7pMo4");
        list.add("2CkJD4C2ZApBx2abABHJ9o6gtMnPEAd");
        list.add("2CbPVwNCQe1mbxZndBtJvJwaQ95fA51");
        list.add("2CjCcfzUfNirzt7nJ6aBYDivEc7m4iz");
        list.add("2CYjMYhoyEFuvBRiyBETm56aVcmXJsL");
        list.add("2CbhCNtgVFkrVqo5r6H9e1SBnRu327X");
        list.add("2CiQZEFTFX6rt54kfFqyowpcfvUZ3QK");
        list.add("2CgsHAsiApM9dKPTKHRuFhqx8f7JZhs");
        list.add("2CcPjsMNAnRKKRUfBtgxYBPRYmVLvno");
        list.add("2CWkDuAiqXLGf9WzPfuYsFpytjihFp5");
        list.add("2Cb1PXzG3L7Q8ydZsfWRHS2ZnUCTeea");
        list.add("2Cc8iYUiyMtr8BgvxqfLL2KNfvUNjkn");
        list.add("2CWKCvBLJReeR28WfAEDZ17mnzQRCTp");
        list.add("2CfgvsGpwYKmfEyZxs9p6dpuYxVBcFn");
        list.add("2Ciq1PChyVeMqF1Jt1JsTrTZCpfthM7");
        list.add("2CYcL8E3kqSM4Hq9eWf6Xs2FiXcBiYd");
        list.add("2CXjAkWQxwiKoh277ikSdCEHVRkZxpM");
        list.add("2CjgYwgNfC53jbspsWskwu8UaybEprF");
        list.add("2CcnKMavwgnAJ4rVhyii5rM7VgbfWPw");
        list.add("2CjXEtP59JSVvCc3EhsuJYti7kHa5uf");
        list.add("2CeKQMRyitVjhBGBXAvBKxs2UFm5d2C");
        list.add("2CZo9FqzByJdkNJ4hP7HbaxNzCfDfok");
        list.add("2CZiiV5zJncyHbrcbAi1JB9HA6qRSpP");
        list.add("2CfZWbruGPtUxMvmnmaot6ZLTJALQRj");
        list.add("2ChLK1NVFQJsy4eidY9oNrWRsnbfmxC");
        list.add("2ChGsAacwsV1tHhcj1maxwAZ5UCqcec");
        list.add("2CgbtMqbBYyCFRQF14XFfhi9RQDEhW5");
        list.add("2CbikAPJ3kMg43u6XGy6SCozjbvWNVs");
        list.add("2CiSikMQitYCTEzu54qrQwApYdyXDSj");
        list.add("2CihKdDP6SsuYz3ZE5zh9A2R9en9JTJ");
        list.add("2CW3dVvfkyihUTMVCcWe4ZBXfzJJWsZ");
        list.add("2CiNuhjAbQKUovpoCuRBLXnMpWnKoKd");
        list.add("2CXLqSkSCnXaehXXpvmBiuUM59iYVro");
        list.add("2CixEJizapDEm5Ro4avpHmUrpTKhDhn");
        list.add("2Cfg126BWT5GdBNayWmfhoB8cA4LxGx");
        list.add("2Chiy7ARh1Cs7wZw9CJUQCLSXjAqvEC");
        list.add("2CbiH8YkprpwZBgSrk8axtnEYNP6pHp");
        list.add("2CYeZcjLN5dcmdY6twHaLgEC8RofzYM");
        list.add("2CbohvMWLJz7j6FQK5GqsVsoN7VXerY");
        list.add("2CW26Kf3kzfWd8MS7EHgz2W2p42WBH9");
        list.add("2CbwUHKHKhVdFfei1xA77uuXz62wyTN");
        list.add("2CaW99V7FNthCp7BUJwfBau1bxcQFmn");
        list.add("2CZhEosBD21XLdwKemvvXn9NrhA4UVX");
        list.add("2Ccm79grNR7DTef7BXvypfYzLG6mhFM");
        list.add("2ChHYeVnP3G7u1BoTPv81KHaCYW3vGP");
        list.add("2CXjt8NCTVLBURaFJ3cxxNFLTDTCixv");
        list.add("2CkSF2aMZBgfow4EiK6nYdB6B5aW3yf");
        list.add("2CeEMxRY7y8Zjm2Skeqo5KZruncwmsr");
        list.add("2ChbbUpKjPdKRkrhjiz8c37YW8S4PgG");
        list.add("2Cj5iQdaoMfeMFdVQV167bFhJH63hrk");
        list.add("2CVq4XEYrWsh42YVPxv9WHKfDdNDd3H");
        list.add("2CjmCP4YnKLqjmZT2zUQrvsubBQx7Lm");
        list.add("2Cg73E3DVLsSmVFcAEVkShRWNS1AWBf");
        list.add("2CbvZgPziNZErhCv5GRDwQSxw192dhQ");
        return list;
    }


    public static void main(String[] args) {
        List<String> addressList = getAddressList();
        for (String toAddress : addressList) {
            String address = "2CXJEuoXZMajeTEgL6TgiSxTRRMwiMM";
//            String toAddress = "2Cg7BLHWBSxMhq3FpjR9BrkyxXp4m4j";
            long amount = 2000200000000L;
            String password = "";
            String remark = "test";

            String param = "{\"address\": \"" + address + "\", \"toAddress\": \"" + toAddress + "\", \"password\": \"" + password + "\", \"amount\": \"" + amount + "\", \"remark\": \"" + remark + "\"}";

            String url = "http://127.0.0.1:8001/api/accountledger/transfer";

            int successCount = 0;

            for (int i = 0; i < 1; i++) {
                String res = post(url, param, "utf-8");

                if (res.indexOf("true") != -1) {
                    successCount++;
                }
                System.out.println(successCount + "  " + res);

//            try {
//                Thread.sleep(100L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            }
        }
    }

    public static String post(String url, final String param, String encoding) {
        StringBuffer sb = new StringBuffer();
        OutputStream os = null;
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        // 默认编码UTF-8
        if (StringUtils.isNull(encoding)) {
            encoding = "UTF-8";
        }
        try {
            URL u = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) u.openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");

            connection.connect();

            os = connection.getOutputStream();
            os.write(param.getBytes(encoding));
            os.flush();
            is = connection.getInputStream();
            isr = new InputStreamReader(is, encoding);
            br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    Log.error(e);
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    Log.error(e);
                }
            }
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    Log.error(e);
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    Log.error(e);
                }
            }
        }
        return sb.toString();
    }
}
