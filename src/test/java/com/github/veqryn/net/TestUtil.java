/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.veqryn.net;

/**
 * Data and utility methods for tests.
 *
 * @author Chris Duncan
 */
public class TestUtil {

  /**
   * The ips held in the 'ips' object array, but in order
   */
  public static final String[] ipsInOrder = new String[] {
      "0.0.0.0",
      "0.0.0.1",
      "127.255.255.255",
      "128.0.0.0",
      "192.168.0.1",
      "211.113.251.89",
      "255.255.255.255",
  };

  /**
   * Data set of verified ip values:
   *
   * <pre>
   * index -- value
   * 0 -- String IPv4 address
   * 1 -- octets int array
   * 2 -- binary int
   * 3 -- sortable int
   * 4 -- unsigned long
   * 5 -- octet 1 int
   * 6 -- octet 2 int
   * 7 -- octet 3 int
   * 8 -- octet 4 int
   * 9 -- binary bit byte array
   * </pre>
   */
  public static final Object[][] ips = new Object[][] {

      {"0.0.0.0", new int[] {0, 0, 0, 0}, 0, Integer.MIN_VALUE, 0L,
          0, 0, 0, 0,
          new byte[] {
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0}},

      {"0.0.0.1", new int[] {0, 0, 0, 1}, 1, Integer.MIN_VALUE + 1, 1L,
          0, 0, 0, 1,
          new byte[] {
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 1}},

      {"127.255.255.255", new int[] {127, 255, 255, 255}, Integer.MAX_VALUE, -1, 2147483647L,
          127, -1, -1, -1,
          new byte[] {
              0, 1, 1, 1, 1, 1, 1, 1,
              1, 1, 1, 1, 1, 1, 1, 1,
              1, 1, 1, 1, 1, 1, 1, 1,
              1, 1, 1, 1, 1, 1, 1, 1}},

      {"128.0.0.0", new int[] {128, 0, 0, 0}, Integer.MIN_VALUE, 0, 2147483648L,
          -128, 0, 0, 0,
          new byte[] {
              1, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0}},

      {"255.255.255.255", new int[] {255, 255, 255, 255}, -1, Integer.MAX_VALUE, 4294967295L,
          -1, -1, -1, -1,
          new byte[] {
              1, 1, 1, 1, 1, 1, 1, 1,
              1, 1, 1, 1, 1, 1, 1, 1,
              1, 1, 1, 1, 1, 1, 1, 1,
              1, 1, 1, 1, 1, 1, 1, 1}},

      {"192.168.0.1", new int[] {192, 168, 0, 1}, -1062731775, 1084751873, 3232235521L,
          -64, -88, 0, 1,
          new byte[] {
              1, 1, 0, 0, 0, 0, 0, 0,
              1, 0, 1, 0, 1, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 0,
              0, 0, 0, 0, 0, 0, 0, 1}},

      {"211.113.251.89", new int[] {211, 113, 251, 89}, -747504807, 1399978841, 3547462489L,
          -45, 113, -5, 89,
          new byte[] {
              1, 1, 0, 1, 0, 0, 1, 1,
              0, 1, 1, 1, 0, 0, 0, 1,
              1, 1, 1, 1, 1, 0, 1, 1,
              0, 1, 0, 1, 1, 0, 0, 1}},

  };

  /**
   * Data set of verified netmask values:
   *
   * <pre>
   * index -- value
   * 0 -- Cidr range /x int
   * 1 -- int value of netmask
   * 2 -- dotted decimal String
   * </pre>
   */
  public static final Object[][] netmasks = new Object[][] {
      {1, -2147483648, "128.0.0.0"},
      {2, -1073741824, "192.0.0.0"},
      {3, -536870912, "224.0.0.0"},
      {4, -268435456, "240.0.0.0"},
      {5, -134217728, "248.0.0.0"},
      {6, -67108864, "252.0.0.0"},
      {7, -33554432, "254.0.0.0"},
      {8, -16777216, "255.0.0.0"},
      {9, -8388608, "255.128.0.0"},
      {10, -4194304, "255.192.0.0"},
      {11, -2097152, "255.224.0.0"},
      {12, -1048576, "255.240.0.0"},
      {13, -524288, "255.248.0.0"},
      {14, -262144, "255.252.0.0"},
      {15, -131072, "255.254.0.0"},
      {16, -65536, "255.255.0.0"},
      {17, -32768, "255.255.128.0"},
      {18, -16384, "255.255.192.0"},
      {19, -8192, "255.255.224.0"},
      {20, -4096, "255.255.240.0"},
      {21, -2048, "255.255.248.0"},
      {22, -1024, "255.255.252.0"},
      {23, -512, "255.255.254.0"},
      {24, -256, "255.255.255.0"},
      {25, -128, "255.255.255.128"},
      {26, -64, "255.255.255.192"},
      {27, -32, "255.255.255.224"},
      {28, -16, "255.255.255.240"},
      {29, -8, "255.255.255.248"},
      {30, -4, "255.255.255.252"},
      {31, -2, "255.255.255.254"},
      {32, -1, "255.255.255.255"},
  };

  /**
   * The cidrs held in the 'cidrs' object array, but in order
   * (not including 0.0.0.0/0 or 0.0.0.0/1 or 128.0.0.0/1 to avoid duplicates)
   */
  public static final String[] cidrsInOrder = new String[] {
      "0.0.0.0/8",
      "0.0.0.0/16",
      "0.0.0.0/24",
      "0.0.0.0/30",
      "0.0.0.0/31",
      "0.0.0.2/32",
      "127.0.0.0/8",
      "127.255.0.0/16",
      "127.255.255.0/24",
      "127.255.255.255/32",
      "128.0.0.0/8",
      "128.0.0.0/16",
      "128.0.0.0/24",
      "128.0.0.0/28",
      "128.0.0.0/29",
      "128.0.0.0/32",
      "128.0.0.3/32",
      "128.0.0.4/30",
      "128.0.0.4/31",
      "128.0.0.4/32",
      "128.0.0.5/32",
      "255.0.0.0/8",
      "255.255.0.0/16",
      "255.255.255.0/24",
      "255.255.255.255/32",
  };

  /**
   * Data set of verified cidr values:
   *
   * <pre>
   * Input values (for creating a new cidr)
   * index -- value
   * 0 -- String Cidr
   * 1 -- String low ip
   * 2 -- String high ip
   * 3 -- netmask bit count int
   * 4 -- octets, maskbits int array
   * 5 -- low binary int
   * 6 -- high binary int
   * 7 -- low sortable int
   * 8 -- high sortable int
   * Output values (what the cidr should look like)
   * 9 -- String Cidr
   * 10 -- String low ip
   * 11 -- String high ip
   * 12 -- netmask bit count int
   * 13 -- low binary int
   * 14 -- high binary int
   * 15 -- low sortable int
   * 16 -- high sortable int
   * 17 -- address count long
   * </pre>
   */
  public static final Object[][] cidrs = new Object[][] {

      {"0.0.0.0/1", "0.0.0.0", "127.255.255.255", 1,
          new int[] {0, 0, 0, 0, 1},
          0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1,
          // output
          "0.0.0.0/1", "0.0.0.0", "127.255.255.255", 1,
          0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1, 2147483648L,
      },

      {"0.0.0.1/1", "0.0.0.1", "127.0.0.0", 1,
          new int[] {0, 0, 0, 1, 1},
          1, Integer.MAX_VALUE, Integer.MIN_VALUE + 1, -1,
          // output
          "0.0.0.0/1", "0.0.0.0", "127.255.255.255", 1,
          0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1, 2147483648L,
      },

      {"0.0.0.1/31", "0.0.0.1", "0.0.0.1", 31,
          new int[] {0, 0, 0, 1, 31},
          0, 1, Integer.MIN_VALUE, Integer.MIN_VALUE + 1,
          // output
          "0.0.0.0/31", "0.0.0.0", "0.0.0.1", 31,
          0, 1, Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 2L,
      },

      {"0.0.0.2/30", "0.0.0.2", "0.0.0.2", 30,
          new int[] {0, 0, 0, 2, 30},
          1, 2, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2,
          // output
          "0.0.0.0/30", "0.0.0.0", "0.0.0.3", 30,
          0, 3, Integer.MIN_VALUE, Integer.MIN_VALUE + 3, 4L,
      },

      {"0.0.0.2/32", "0.0.0.2", "0.0.0.2", 32,
          new int[] {0, 0, 0, 2, 32},
          2, 2, Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 2,
          // output
          "0.0.0.2/32", "0.0.0.2", "0.0.0.2", 32,
          2, 2, Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 2, 1L,
      },

      {"0.0.0.128/24", "0.0.0.128", "0.0.0.250", 24,
          new int[] {0, 0, 0, 128, 24},
          127, 128, Integer.MIN_VALUE + 127, Integer.MIN_VALUE + 128,
          // output
          "0.0.0.0/24", "0.0.0.0", "0.0.0.255", 24,
          0, 255, Integer.MIN_VALUE, Integer.MIN_VALUE + 255, 256L,
      },

      {"0.0.127.1/16", "0.0.127.1", "0.0.250.250", 16,
          new int[] {0, 0, 127, 1, 16},
          256, 35535, Integer.MIN_VALUE + 256, Integer.MIN_VALUE + 35535,
          // output
          "0.0.0.0/16", "0.0.0.0", "0.0.255.255", 16,
          0, 65535, Integer.MIN_VALUE, Integer.MIN_VALUE + 65535, 65536L,
      },

      {"0.250.250.250/8", "0.250.250.250", "0.254.254.254", 8,
          new int[] {0, 250, 250, 250, 8},
          65535, 10777215, Integer.MIN_VALUE + 65535, Integer.MIN_VALUE + 10777215,
          // output
          "0.0.0.0/8", "0.0.0.0", "0.255.255.255", 8,
          0, 16777215, Integer.MIN_VALUE, Integer.MIN_VALUE + 16777215, 16777216L,
      },


      {"127.255.255.255/32", "127.255.255.255", "127.255.255.255", 32,
          new int[] {127, 255, 255, 255, 32},
          Integer.MAX_VALUE, Integer.MAX_VALUE, -1, -1,
          // output
          "127.255.255.255/32", "127.255.255.255", "127.255.255.255", 32,
          Integer.MAX_VALUE, Integer.MAX_VALUE, -1, -1, 1L,
      },

      {"127.255.255.255/24", "127.255.255.0", "127.255.255.255", 24,
          new int[] {127, 255, 255, 255, 24},
          Integer.MAX_VALUE - 128, Integer.MAX_VALUE - 127, -129, -128,
          // output
          "127.255.255.0/24", "127.255.255.0", "127.255.255.255", 24,
          Integer.MAX_VALUE - 255, Integer.MAX_VALUE, -256, -1, 256L,
      },

      {"127.255.255.255/16", "127.255.0.0", "127.255.255.255", 16,
          new int[] {127, 255, 255, 255, 16},
          Integer.MAX_VALUE - 35535, Integer.MAX_VALUE - 300, -35536, -300,
          // output
          "127.255.0.0/16", "127.255.0.0", "127.255.255.255", 16,
          Integer.MAX_VALUE - 65535, Integer.MAX_VALUE, -65536, -1, 65536L,
      },

      {"127.255.255.255/8", "127.0.0.0", "127.255.255.255", 8,
          new int[] {127, 255, 255, 255, 8},
          Integer.MAX_VALUE - 10777215, Integer.MAX_VALUE - 65539, -10777215, -65539,
          // output
          "127.0.0.0/8", "127.0.0.0", "127.255.255.255", 8,
          Integer.MAX_VALUE - 16777215, Integer.MAX_VALUE, -16777216, -1, 16777216L,
      },

      {"127.255.255.255/1", "0.0.0.0", "127.255.255.255", 1,
          new int[] {127, 255, 255, 255, 1},
          0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1,
          // output
          "0.0.0.0/1", "0.0.0.0", "127.255.255.255", 1,
          0, Integer.MAX_VALUE, Integer.MIN_VALUE, -1, 2147483648L,
      },


      {"128.0.0.0/32", "128.0.0.0", "128.0.0.0", 32,
          new int[] {128, 0, 0, 0, 32},
          Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0,
          // output
          "128.0.0.0/32", "128.0.0.0", "128.0.0.0", 32,
          Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0, 1L,
      },

      {"128.0.0.0/24", "128.0.0.0", "128.0.0.255", 24,
          new int[] {128, 0, 0, 0, 24},
          Integer.MIN_VALUE, Integer.MIN_VALUE + 255, 0, 255,
          // output
          "128.0.0.0/24", "128.0.0.0", "128.0.0.255", 24,
          Integer.MIN_VALUE, Integer.MIN_VALUE + 255, 0, 255, 256L,
      },

      {"128.0.0.0/16", "128.0.0.0", "128.0.255.255", 16,
          new int[] {128, 0, 0, 0, 16},
          Integer.MIN_VALUE, Integer.MIN_VALUE + 65535, 0, 65535,
          // output
          "128.0.0.0/16", "128.0.0.0", "128.0.255.255", 16,
          Integer.MIN_VALUE, Integer.MIN_VALUE + 65535, 0, 65535, 65536L,
      },

      {"128.0.0.0/8", "128.0.0.0", "128.255.255.255", 8,
          new int[] {128, 0, 0, 0, 8},
          Integer.MIN_VALUE, Integer.MIN_VALUE + 16777215, 0, 16777215,
          // output
          "128.0.0.0/8", "128.0.0.0", "128.255.255.255", 8,
          Integer.MIN_VALUE, Integer.MIN_VALUE + 16777215, 0, 16777215, 16777216L,
      },

      {"128.0.0.0/1", "128.0.0.0", "255.255.255.255", 1,
          new int[] {128, 0, 0, 0, 1},
          Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE,
          // output
          "128.0.0.0/1", "128.0.0.0", "255.255.255.255", 1,
          Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE, 2147483648L,
      },


      {"255.255.255.255/32", "255.255.255.255", "255.255.255.255", 32,
          new int[] {255, 255, 255, 255, 32},
          -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE,
          // output
          "255.255.255.255/32", "255.255.255.255", "255.255.255.255", 32,
          -1, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, 1L,
      },

      {"255.255.255.255/24", "255.255.255.255", "255.255.255.255", 24,
          new int[] {255, 255, 255, 255, 24},
          -1 - 255, -1, Integer.MAX_VALUE - 255, Integer.MAX_VALUE,
          // output
          "255.255.255.0/24", "255.255.255.0", "255.255.255.255", 24,
          -1 - 255, -1, Integer.MAX_VALUE - 255, Integer.MAX_VALUE, 256L,
      },

      {"255.255.255.255/16", "255.255.255.255", "255.255.255.255", 16,
          new int[] {255, 255, 255, 255, 16},
          -1 - 65535, -1, Integer.MAX_VALUE - 65535, Integer.MAX_VALUE,
          // output
          "255.255.0.0/16", "255.255.0.0", "255.255.255.255", 16,
          -1 - 65535, -1, Integer.MAX_VALUE - 65535, Integer.MAX_VALUE, 65536L,
      },

      {"255.255.255.255/8", "255.255.255.255", "255.255.255.255", 8,
          new int[] {255, 255, 255, 255, 8},
          -1 - 16777215, -1, Integer.MAX_VALUE - 16777215, Integer.MAX_VALUE,
          // output
          "255.0.0.0/8", "255.0.0.0", "255.255.255.255", 8,
          -1 - 16777215, -1, Integer.MAX_VALUE - 16777215, Integer.MAX_VALUE, 16777216L,
      },

      {"255.255.255.255/1", "255.255.255.255", "255.255.255.255", 1,
          new int[] {255, 255, 255, 255, 1},
          Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE,
          // output
          "128.0.0.0/1", "128.0.0.0", "255.255.255.255", 1,
          Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE, 2147483648L,
      },


      {"128.0.0.4/32", "128.0.0.4", "128.0.0.4", 32,
          new int[] {128, 0, 0, 4, 32},
          Integer.MIN_VALUE + 4, Integer.MIN_VALUE + 4, 4, 4,
          // output
          "128.0.0.4/32", "128.0.0.4", "128.0.0.4", 32,
          Integer.MIN_VALUE + 4, Integer.MIN_VALUE + 4, 4, 4, 1L,
      },

      {"128.0.0.5/31", "128.0.0.5", "128.0.0.4", 31,
          new int[] {128, 0, 0, 5, 31},
          Integer.MIN_VALUE + 4, Integer.MIN_VALUE + 5, 4, 5,
          // output
          "128.0.0.4/31", "128.0.0.4", "128.0.0.5", 31,
          Integer.MIN_VALUE + 4, Integer.MIN_VALUE + 5, 4, 5, 2L,
      },

      {"128.0.0.5/30", "128.0.0.5", "128.0.0.6", 30,
          new int[] {128, 0, 0, 7, 30},
          Integer.MIN_VALUE + 5, Integer.MIN_VALUE + 6, 5, 6,
          // output
          "128.0.0.4/30", "128.0.0.4", "128.0.0.7", 30,
          Integer.MIN_VALUE + 4, Integer.MIN_VALUE + 7, 4, 7, 4L,
      },

      {"128.0.0.4/29", "128.0.0.4", "128.0.0.5", 29,
          new int[] {128, 0, 0, 4, 29},
          Integer.MIN_VALUE + 3, Integer.MIN_VALUE + 4, 3, 4,
          // output
          "128.0.0.0/29", "128.0.0.0", "128.0.0.7", 29,
          Integer.MIN_VALUE, Integer.MIN_VALUE + 7, 0, 7, 8L,
      },

      {"128.0.0.4/28", "128.0.0.4", "128.0.0.4", 28,
          new int[] {128, 0, 0, 4, 28},
          Integer.MIN_VALUE + 7, Integer.MIN_VALUE + 8, 7, 8,
          // output
          "128.0.0.0/28", "128.0.0.0", "128.0.0.15", 28,
          Integer.MIN_VALUE, Integer.MIN_VALUE + 15, 0, 15, 16L,
      },


      {"128.0.0.3/32", "128.0.0.3", "128.0.0.3", 32,
          new int[] {128, 0, 0, 3, 32},
          Integer.MIN_VALUE + 3, Integer.MIN_VALUE + 3, 3, 3,
          // output
          "128.0.0.3/32", "128.0.0.3", "128.0.0.3", 32,
          Integer.MIN_VALUE + 3, Integer.MIN_VALUE + 3, 3, 3, 1L,
      },


      {"128.0.0.5/32", "128.0.0.5", "128.0.0.5", 32,
          new int[] {128, 0, 0, 5, 32},
          Integer.MIN_VALUE + 5, Integer.MIN_VALUE + 5, 5, 5,
          // output
          "128.0.0.5/32", "128.0.0.5", "128.0.0.5", 32,
          Integer.MIN_VALUE + 5, Integer.MIN_VALUE + 5, 5, 5, 1L,
      },

  };

}
