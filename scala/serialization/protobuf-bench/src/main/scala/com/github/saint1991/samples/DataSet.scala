package com.github.saint1991.samples

import java.util.UUID
import java.util.concurrent.ThreadLocalRandom

import com.github.saint1991.samples.nobid.Nobid
import com.github.saint1991.samples.spot.{Spot, SpotType}

object DataSet {
  def createDataset(n: Int): Seq[Nobid] = for {
    i <- 1 to n
    data = Nobid(
      adnwId = ThreadLocalRandom.current().nextInt(0, 8),
      appName = "sampleApp",
      auctionId = UUID.randomUUID().toString,
      host = "lodeo-prd-dsp03",
      loggedAt = "2017-06-30 09:07:37.677",
      mId = 234,
      nbr = 6260,
      page = "http://diamond.jp/articles/a/15434",
      resTime = 4,
      spot = Some(Spot(
        id = 2406,
        `type` = SpotType.S
      )),
      history = Seq(
        "a",
        "b",
        "c"
      ),
      tags = Map(
        "media" -> "facebook",
        "ssp" -> "profitx"
      )
    )
  } yield data
}
