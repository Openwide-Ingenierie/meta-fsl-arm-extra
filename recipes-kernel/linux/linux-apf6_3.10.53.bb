SUMMARY = "Linux kernel for Armadeus board with Preemt RT patch"

require linux-apf6.inc

SRCBRANCH = "wandboard_imx_3.10.53_1.1.0_ga"
SRCREV = "13bb18444208d5065f0e6345c7743e9662bc97d2"
LOCALVERSION = "_1.1.0_ga-apf6"

SRC_URI += "file://defconfig"

