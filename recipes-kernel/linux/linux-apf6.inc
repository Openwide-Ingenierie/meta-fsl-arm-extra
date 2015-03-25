# Adapted from linux-wandboard and linux-imx recipes.
# The supported kernel for APF6 boards use linux-wandboard code.

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(apf6dl|apf6q)"

SRC_URI = "git://github.com/wandboard-org/linux.git;branch=${SRCBRANCH} \
           file://0001-add-imx6-dtb-for-dual-and-quad-apf6.patch \
           file://0002-decrease-pcie_set_read_rq-size-from-4096-to-256.patch \
           file://0504-armadeus-add_sx8674_touchscreen_driver.patch \
           file://0505-armadeus-add_mcp7940x_rtc_driver.patch \
           file://059X-armadeus-add-wireless-driver.patch \
"

