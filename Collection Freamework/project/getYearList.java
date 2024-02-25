private void getYearList() {
                List<YearData> yearList = null;// Blank list of POJO class
                Scanner scanner = null;
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader("C:\\Users\\Piyush More\\OneDrive\\Desktop\\JavaClassRoomProgram\\Collection Freamework\\project\\survey.csv"));
                    Map<String, Integer> mailHeader = new HashMap<String, Integer>();
                    // read file line by line
                    String line = null;
                    int index = 0;
                    line = reader.readLine();
                    // Get header from 1st row of csv
                    if (line != null) {
                        StringTokenizer str = new StringTokenizer(line, ",");
                        int headerCount = str.countTokens();
                        for (int i = 0; i < headerCount; i++) {
                            String headerKey = str.nextToken();
                            mailHeader.put(headerKey.toUpperCase(), new Integer(i));

                        }
                    }
                    yearList = new ArrayList<YearData>();

                    while ((line = reader.readLine()) != null) {
                    // POJO class for getter and setters
                        YearData email = new YearData();
                        scanner = new Scanner(line);
                        scanner.useDelimiter(",");
                    //Use Specific key to get value what u want
                        while (scanner.hasNext()) {
                            String data = scanner.next();
                            if (index == mailHeader.get("EMAIL"))
                                email.setYear(data);
                            /*else if (index == mailHeader.get("FN"))
                                email.setFirstName(data);
                            else if (index == mailHeader.get("LN"))
                                email.setLastName(data);*/
                            else if (index == mailHeader.get("CC"))
                                email.setCouponCode(data);

                            index++;
                        }
                        index = 0;
                        yearList.add(email);
                    }
                    reader.close();
                } catch (Exception e) {
                    StringWriter stack = new StringWriter();
                    e.printStackTrace(new PrintWriter(stack));

                } finally {
                    scanner.close();
                }

                System.out.println("list--" + yearList);

            }
