SUMMARY = "Linux kernel for Armadeus board with Preemt RT patch"

require linux-apf6.inc

# Wandboard branch - based on 3.10.53_1.1.0_ga from Freescale git
SRCBRANCH = "wandboard_imx_3.10.53_1.1.0_ga"
SRCREV = "13bb18444208d5065f0e6345c7743e9662bc97d2"
LOCALVERSION = "_1.1.0_ga-apf6-rt"

SRC_URI += "https://www.kernel.org/pub/linux/kernel/projects/rt/3.10/older/patch-3.10.53-rt56.patch.gz \
            file://0001-fix-build.patch \
	    file://0002-fix-build-with-rt-enabled.patch \
	    file://0003-no-split-ptlocks.patch \
	    file://0001-Fix-Build-after-applying-rt-patch.patch \
"

SRC_URI[md5sum] = "5172eba68b81eb952513a47dd6733728"
SRC_URI[sha256sum] = "b900e52ecf4cda0c1543a7424c48191c60c20211bd950349fd8438016d5ed532"
